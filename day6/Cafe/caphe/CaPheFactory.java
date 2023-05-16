package day6.Cafe.caphe;

import day6.Cafe.caphe.*;

public class CaPheFactory {
    CaPheFactory(){}
    public static CaPhe getCaPhe(CaPheType caPheType){
        switch (caPheType){
            case ESPRESSO:
                return new Espresso("Hạt rang", 10,20,50);
            case DENDA:
                return new Denda("Hạt rang", 10,20,50);
            case NAUDA:
                return new NauDa("Hạt rang", 10);
            case LATTE:
                return new Latte("Hạt rang", 10);
            case BACXIU:
                return new BacXiu("Hạt rang", 10);
            default:
                return null;
        }
    }
}
