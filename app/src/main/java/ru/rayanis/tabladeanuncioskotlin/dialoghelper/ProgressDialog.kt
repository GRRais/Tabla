package ru.rayanis.tabladeanuncioskotlin.dialoghelper

import android.app.Activity
import android.app.AlertDialog
import ru.rayanis.tabladeanuncioskotlin.databinding.ProgressDialogLayoutBinding
import ru.rayanis.tabladeanuncioskotlin.databinding.SignDialogBinding

object ProgressDialog {
    fun createProgressDialog(act: Activity): AlertDialog {
        val builder = AlertDialog.Builder(act)
        val b = ProgressDialogLayoutBinding.inflate(act.layoutInflater)
        val view = b.root
        builder.setView(view)
        val dialog = builder.create()
        dialog.setCancelable(false)
        dialog.show()
        return dialog
    }
}