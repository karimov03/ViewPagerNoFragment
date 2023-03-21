package com.example.viewpager1

object MyData {
    data class Text(
        val name:String,
        val about:String,
        val backeound:Int
    )
    val list=ArrayList<Text>()

    fun Addlist(){
        list.add(MyData.Text("Xush kelibsiz","Kim ko‘rubdur, ey ko‘ngul, ahli jahondin yaxshilig‘, \n" +
                "Kimki, ondin yaxshi yo‘q, ko‘z tutma ondin yaxshilig‘",R.drawable.back1))
        list.add(MyData.Text("Hikoyalar dunyosi","Gar zamonni nayf qilsam ayb qilma, ey rafiq, \n" +
                "Ko‘rmadim hargiz, netoyin, bu zamondin yaxshilig‘ ! ",R.drawable.back2))
        list.add(MyData.Text("Kitob ortidan..","Dilrabolardin yomonliq keldi mahzun ko‘ngluma,\n" +
                " Kelmadi jonimg'a hech oromi jondin yaxshilig'.",R.drawable.back3))
        list.add(MyData.Text("Bizga qo`shiling","Ey ko‘ngul, chun yaxshidin ko‘rdung yamonliq asru ko‘p,\n" +
                " Emdi ko‘z tutmoq ne ma’ni har yamondin yaxshilig'?",R.drawable.back4))
    }
}