package com.example.fearpally.kontrolnatacka2.provaders;

import com.example.fearpally.kontrolnatacka2.model.Filmovi;

import java.util.ArrayList;
import java.util.List;



public class FilmoviProvider {

    public  static List<Filmovi> getFilm(){

        List<Filmovi> filmovi = new ArrayList<>();
        filmovi.add(new Filmovi(0, "Mrtav `Ladan"));
        filmovi.add(new Filmovi(1, "Zona Zanfirova"));
        filmovi.add(new Filmovi(2, "Lajanje na Zvezde"));
        filmovi.add(new Filmovi(3, "Profesionalac"));
        return filmovi;
    }

    public static List<String> getFilmNames(){
        List<String> names = new ArrayList<>();
        names.add("Mrtav `Ladan");
        names.add("Zona Zanfirova");
        names.add("Lajanje na Zvezde");
        names.add("Profesionalac");
        return names;

    }
    public static Filmovi getFilmoviById(int id){

        switch (id){
            case 0:
                return new Filmovi(0, "Mrtav `Ladan");
            case 1:
                return new Filmovi(1, "Zona Zanfirova");
            case 2:
                return new Filmovi(2,"Lajanje na Zvezde");
            case 3:
                return new Filmovi(3, "Profesionalac");
            default:
                return null;
        }
    }
}


