package com.example.convidados.repository

import android.content.Context
import com.example.convidados.model.GuestModel

// Implementação do padrão Singleton
// Classe utilizada para manipulação dos dados

class GuestRepository(context: Context) {

    private val guestDataBase = GuestDataBase.getDataBase(context).guestDAO()

    fun insert(guest: GuestModel): Boolean {
        return guestDataBase.insert(guest) > 0
    }

    fun update(guest: GuestModel): Boolean {
        return guestDataBase.update(guest) > 0
    }

    fun delete(id: Int): Boolean {
        val guest = get(id)
        return try {
            guestDataBase.delete(guest)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun getAll(): List<GuestModel> {
        return guestDataBase.getAll()
    }

    fun getPresent(): List<GuestModel> {
        return guestDataBase.getPresent()
    }

    fun getAbsent(): List<GuestModel> {
        return guestDataBase.getAbsent()
    }

    fun get(id: Int): GuestModel {
        return guestDataBase.get(id)
    }
}