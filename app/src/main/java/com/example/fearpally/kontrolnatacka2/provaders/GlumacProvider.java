package com.example.fearpally.kontrolnatacka2.provaders;

import com.example.fearpally.kontrolnatacka2.model.Filmovi;
import com.example.fearpally.kontrolnatacka2.model.Glumac;

import java.util.ArrayList;
import java.util.List;

public class GlumacProvider {

    public static List<Glumac> getGlumci(){

        Filmovi filmovi0= new Filmovi(0, "Mrtav `Ladan");
        Filmovi filmovi1=new Filmovi(1, "Zona Zanfirova");
        Filmovi filmovi2=new Filmovi(2, "Lajanje na Zvezde");
        Filmovi filmovi3=new Filmovi(3, "Profesionalac");


        List<Glumac> glumac = new ArrayList<>();

        glumac.add(new Glumac(0,"Velimir Bata","Zivojnovic", "Велимир Бата Живојиновић био је југословенски и српски позоришни, телевизијски и филмски глумац. Био је најпознатији југословенски глумац по улогама у партизанским филмовима везаним за Други светски рат.","BelimirBataZivojnovic.jpeg", 4.0f, null,null,filmovi0));
        glumac.add(new Glumac(1,"Lane","Gutovic", "Милан је рођен у Умци градском насељу Београда. Завршио Академију за позориште, филм, радио и телевизију y Београду","LaneGutovic.jpg", 4.5f, null,null,filmovi1 ));
        glumac.add(new Glumac(2,"Nikola","Djuricko", "Никола Ђуричко је српски глумац, музичар и телевизијски водитељ.","NikolaDjuricko.jpeg", 4.2f, null,null,filmovi2 ));
        glumac.add(new Glumac(3,"Nikola","Kojo", "Име Никола је добио по прадеди, који је био протојереј у Мостару. Којо је на филму дебитовао са непуних 13 година, улогом дечака Ивана у филму Рад на одређено време.","NikolaKojo.jpeg", 3.5f, null,null,filmovi3 ));
        return glumac;

    }


    public static Glumac getGlumacById(int id){

        Filmovi filmovi0= new Filmovi(0, "Mrtav `Ladan");
        Filmovi filmovi1=new Filmovi(1, "Zona Zanfirova");
        Filmovi filmovi2=new Filmovi(2, "Lajanje na Zvezde");
        Filmovi filmovi3=new Filmovi(3, "Profesionalac");

        switch (id){
            case 0:
                return new Glumac(0,"Velimir Bata","Zivojnovic", "Велимир Бата Живојиновић био је југословенски и српски позоришни, телевизијски и филмски глумац. Био је најпознатији југословенски глумац по улогама у партизанским филмовима везаним за Други светски рат.","BelimirBataZivojnovic.jpeg", 4.0f, null,null,filmovi0 );
            case 1:
                return new Glumac(1,"Lane","Gutovic", "Милан је рођен у Умци градском насељу Београда. Завршио Академију за позориште, филм, радио и телевизију y Београду","LaneGutovic.jpg", 4.5f, null,null,filmovi1 );
            case 2:
                return new Glumac(2,"Nikola","Djuricko", "Никола Ђуричко је српски глумац, музичар и телевизијски водитељ.","NikolaDjuricko.jpeg", 4.2f, null,null,filmovi2 );
            case 3:
                return new Glumac(3,"Nikola","Kojo", "Име Никола је добио по прадеди, који је био протојереј у Мостару. Којо је на филму дебитовао са непуних 13 година, улогом дечака Ивана у филму Рад на одређено време.","NikolaKojo.jpeg", 3.5f, null,null,filmovi3 );
            default:
                return null;
        }
    }
}
