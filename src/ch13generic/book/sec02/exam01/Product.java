package ch13generic.book.sec02.exam01;

public class Product <K,N>{

    private K kind;
    private N model;

    public K getKind(){ return this.kind;}
    public N getModel(){ return this.model;}

    public void setKind (K kind ){ this.kind=kind;}
    public void setModel (N model){this.model=model;}

}
