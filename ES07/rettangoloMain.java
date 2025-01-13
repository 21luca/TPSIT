class rettangolo {
    private  int base; 
    private  int altezza; 

    
    public int Area() {
        return base * altezza;
    }
public void setBase(int base) {
    this.base = base;
    }
public void setAltezza(int altezza) {
    this.altezza = altezza;
        }
    }

   public class rettangoloMain{
    public static void main(String[] args) {
        rettangolo r = new rettangolo();
        r.setBase (12);
        r.setAltezza (21);
        }
    }