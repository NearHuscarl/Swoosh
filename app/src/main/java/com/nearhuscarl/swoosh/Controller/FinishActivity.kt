package com.nearhuscarl.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nearhuscarl.swoosh.Model.Player
import com.nearhuscarl.swoosh.R
import com.nearhuscarl.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
