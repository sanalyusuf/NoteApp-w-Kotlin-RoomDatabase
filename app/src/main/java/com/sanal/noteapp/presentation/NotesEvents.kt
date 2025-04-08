package com.sanal.noteapp.presentation

import com.sanal.noteapp.data.Note

sealed interface NotesEvent {
    data object SortNotes: NotesEvent

    data class  DeleteNote(val note: Note): NotesEvent

    data class  SaveNote(
        val title: String,
        val description: String

    ): NotesEvent
}