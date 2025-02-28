interface Animale {
    void verso();
    void muoviti();
}

interface Parlante {
    void parla();
    void saluta();
}

class Cagnolino implements Animale {
    @Override
    public void verso() {
        System.out.println("il cane abbaia");
    }
    @Override
    public void muoviti() {
        System.out.println("il cane corre");
    }
}

class Pappagallo implements Animale, Parlante {
    @Override
    public void verso() {
        System.out.println("il pappagallo fischia");
    }
    
    @Override
    public void muoviti() {
        System.out.println("il pappagallo vola");
    }
    
    @Override
    public void parla() {
        System.out.println("il pappagallo ripete: ciao");
    }
    
    @Override
    public void saluta() {
        System.out.println("il pappagallo saluta battendo le ali");
    }
}

class Gattino implements Animale {
    @Override
    public void verso() {
        System.out.println("il gatto miagola");
    }
    
    @Override
    public void muoviti() {
        System.out.println("il gatto cammina");
    }
}

public class Animali2 {
    public static void main(String[] args) {
        Animale pappagallo = new Pappagallo();
        Animale cagnolino = new Cagnolino();
        Animale gattino = new Gattino();
        
        pappagallo.verso();
        pappagallo.muoviti();
        ((Parlante) pappagallo).parla();
        ((Parlante) pappagallo).saluta();
        
        System.out.println();
        
        cagnolino.verso();
        cagnolino.muoviti();
        
        System.out.println();
        
        gattino.verso();
        gattino.muoviti();
    }
}