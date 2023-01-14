package com.github.josebaperu.javabasico.tuto.newboston.Importarlos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public enum Parejas {
    Carlos("nice","22"),
    Evelyn("cutie","10"),

    Olenka("bigmistake","12"),
    Nicole("italian", "12"),
    Abril("different", "14"),
    Xiomara("iwish","16");





    private final String desc;
    private final String year;

    Parejas(String description,String birthday){
            desc = description;
            year = birthday;
    }
    public String   getDesc(){
        return  desc;
    }

    public String getYear() {
        return year;
    }
}
