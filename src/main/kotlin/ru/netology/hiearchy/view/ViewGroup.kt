package ru.netology.hiearchy.view

class ViewGroup: View() {
    private var view = View()
    fun addView(view: View) {
        this.view = view
    }
}