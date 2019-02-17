package com.ZachD.week4.enums;

public enum NFC {
    ARIZONA("Cardinals"),
    ATLANTA("Falcons"),
    CAROLINA("Panthers"),
    CHICAGO("Bears"),
    DALLAS("Cowboys"),
    DETROIT("Lions"),
    GREENBAY("Packers"),
    LOSANGELES("Rams"),
    MINNESOTA("Vikings"),
    NEWORLEANS("Saints"),
    NEWYORK("Giants"),
    NONE("No Team"),
    PHILADELPHIA("Eagles"),
    SANFRANCISCO("49ers"),
    SEATTLE("Seahawks"),
    TAMPABAY("Buccaneers"),
    WASHINGTON("Redskins");

    private final String name;

    private NFC(String s) {
        name = s;
    }

    public NFC getTeam(String s) {
        NFC gotten;

        switch (s) {
            case "DAL":
            case "COW":
                gotten = NFC.DALLAS;
                break;
            case "NEW":
            case "GIA":
                gotten = NFC.NEWYORK;
                break;
            case "PHI":
            case "EAG":
                gotten = NFC.PHILADELPHIA;
                break;
            case "WAS":
            case "RED":
                gotten = NFC.WASHINGTON;
                break;
            case "CHI":
            case "BEA":
                gotten = NFC.CHICAGO;
                break;
            case "DET":
            case "LIO":
                gotten = NFC.DETROIT;
                break;
            case "GRE":
            case "PAC":
                gotten = NFC.GREENBAY;
                break;
            case "MIN":
            case "VIK":
                gotten = NFC.MINNESOTA;
                break;
            case "ATL":
            case "FAL":
                gotten = NFC.ATLANTA;
                break;
            case "CAR":
            case "PAN":
                gotten = NFC.CAROLINA;
                break;
           /* case "NEW":
                gotten = NFC.NEWORLEANS;
                break; */
            case "SAI":
                gotten = NFC.NEWORLEANS;
                break;
            case "TAM":
            case "BUC":
                gotten = NFC.TAMPABAY;
                break;
            case "ARI": //case "CAR":
                gotten = NFC.ARIZONA;
                break;
            case "LOS":
            case "RAM":
                gotten = NFC.LOSANGELES;
                break;
            case "SAN":
            case "49E":
                gotten = NFC.SANFRANCISCO;
                break;
            case "SEA":
                gotten = NFC.SEATTLE;
                break;
                default:
                    gotten = NFC.NONE;
                    break;
        }

        return gotten;
    }

    public String getFull(NFC team){
        return team + " " + name;
    }
}
