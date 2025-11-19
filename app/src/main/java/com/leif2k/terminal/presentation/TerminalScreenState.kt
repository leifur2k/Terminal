package com.leif2k.terminal.presentation

import com.leif2k.terminal.data.Bar

sealed class TerminalScreenState {

    object Initial : TerminalScreenState()

    data class Content(val barList: List<Bar>) : TerminalScreenState()
}