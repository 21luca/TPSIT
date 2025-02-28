interface Animale {
    void verso();
    void muoviti();
}

interface Parlante {
    void parla();
    void saluta();
}

class Pappagallo implements Animale, Parlante {
    @Override
    public void verso() {
        System.out.println("Il pappagallo fischia");
    }
    
    @Override
    public void muoviti() {
        System.out.println("Il pappagallo vola");
    }
    
    @Override
    public void parla() {
        System.out.println("Il pappagallo dice: Ciao!");
    }
    
    @Override
    public void saluta() {
        System.out.println("Il pappagallo saluta con un battito d'ali");
    }
}

class Cane implements Animale {
    @Override
    public void verso() {
        System.out.println("Il cane abbaia");
    }
    
    @Override
    public void muoviti() {
        System.out.println("Il cane corre");
    }
}

class Gatto implements Animale {
    @Override
    public void verso() {
        System.out.println("Il gatto miagola");
    }
    
    @Override
    public void muoviti() {
        System.out.println("Il gatto cammina silenziosamente");
    }
}

public class es06 {
    public static void main(String[] args) {
        Animale pappagallo = new Pappagallo();
        Animale cane = new Cane();
        Animale gatto = new Gatto();
        
        pappagallo.verso();
        pappagallo.muoviti();
        ((Parlante) pappagallo).parla();
        ((Parlante) pappagallo).saluta();
        
        System.out.println();
        
        cane.verso();
        cane.muoviti();
        
        System.out.println();
        
        gatto.verso();
        gatto.muoviti();
    }
}