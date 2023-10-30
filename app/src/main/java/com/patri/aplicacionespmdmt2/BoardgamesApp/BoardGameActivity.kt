package com.patri.aplicacionespmdmt2.BoardgamesApp

import android.app.Dialog
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.patri.aplicacionespmdmt2.R

class BoardGameActivity : AppCompatActivity() {

    private lateinit var rvCategories: RecyclerView
    private lateinit var rvGames: RecyclerView
    private lateinit var fabAddGame: FloatingActionButton

    private lateinit var categoriesAdapter: CategoriesAdapter
    private lateinit var gamesAdapter: GamesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_game)
    }

    private fun initComponents(){
        rvCategories = findViewById(R.id.rvCategories)
        rvGames = findViewById(R.id.rvGames)
        fabAddGame = findViewById(R.id.fabAddGame)
    }

    private fun initListeners() { fabAddGame.setOnClickListener{ showDialog() }

    }

    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_game)

        val btnAddGame: Button = dialog.findViewById(R.id.btnAddGame)
        val etGame: EditText = dialog.findViewById(R.id.etGame)
        val rgCategories: RadioGroup = dialog.findViewById(R.id.rgCategories)

        btnAddGame.setOnClickListener {
            val currentGame = etGame.text.toString()
            if(currentGame.isNotEmpty()){
                val selectedId = rgCategories.checkedRadioButtonId
                val selectedRadioButton: RadioButton = rgCategories.findViewById(selectedId)
                val currentCategory: GameCategory = when(selectedRadioButton.text) {
                    getString(R.string.dialog_cooperative_category) -> Cooperative
                    getString(R.string.dialog_deckbuilding_category) -> Deckbuilding
                    getString(R.string.dialog_euro_category) -> Euro
                    getString(R.string.dialog_lcg_category) -> LCG
                    else -> Legacy
                }
                games.add(Game(currentGame, currentCategory))
                updateGames()
                dialog.hide()

            }
        }
        dialog.show()
    }

    private fun updateGames() {

        val selectedCategories: List<GameCategory> = categories.filter { it.isSelected }
        /** Aplica un filtro que es cuales de ellas están seleccionadas .isSelected
         * */
        val newGames = games.filter { selectedCategories.contains(it.category) }

        gamesAdapter.games = newGames
        gamesAdapter.notifyDataSetChanged() /**Notificamos que ha cambiado*/
    }


    private fun onGameSelected(position:Int){
        games[position].isSelected = !games[position].isSelected
        updateGames()
    }


    private fun initUI(){
        categoriesAdapter = CategoriesAdapter(categories)
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter

        gamesAdapter = GamesAdapter(games) {position -> onGameSelected(position)}
        rvGames.layoutManager = LinearLayoutManager(this)
        rvGames.adapter = gamesAdapter
    }




}