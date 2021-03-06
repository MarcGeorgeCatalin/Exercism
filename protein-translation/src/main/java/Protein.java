public enum Protein {
    AUG("Methionine"),
    UUU("Phenylalanine"),
    UUC("Phenylalanine"),
    UUA("Leucine"),
    UUG("Leucine"),
    UCU("Serine"),
    UCC("Serine"),
    UCA("Serine"),
    UCG("Serine"),
    UAU("Tyrosine"),
    UAC("Tyrosine"),
    UGU("Cysteine"),
    UGC("Cysteine"),
    UGG("Tryptophan"),
    UAA("STOP"),
    UAG("STOP"),
    UGA("STOP");

    String s;

    Protein(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

}
