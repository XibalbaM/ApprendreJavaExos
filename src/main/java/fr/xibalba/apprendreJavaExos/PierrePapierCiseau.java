package fr.xibalba.apprendreJavaExos;

public enum PierrePapierCiseau {
    PIERRE,
    PAPIER,
    CISEAU;

    public Result bat(PierrePapierCiseau thing) {

        if (this == thing) {
            return Result.EGAL;
        }

        int value = thing.ordinal() + 1;
        if (value >= PierrePapierCiseau.values().length)
            value = 0;
        return value == this.ordinal() ? Result.BAT : Result.PERD;
    }

    public enum Result {
        BAT,
        EGAL,
        PERD
    }
}
