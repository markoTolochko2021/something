package test.innerNestedLocalClasses;

public class Test3 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math{
    public void getResult(){
        class Dilennya{
            private int chuselnuk;
            private int znamennuk;

            public int getChuselnuk() {
                return chuselnuk;
            }

            public void setChuselnuk(int chuselnuk) {
                this.chuselnuk = chuselnuk;
            }

            public int getZnamennuk() {
                return znamennuk;
            }

            public void setZnamennuk(int znamennuk) {
                this.znamennuk = znamennuk;
            }

            public int getChastku(){
                return chuselnuk/znamennuk;
            }
            public int getOstacha(){
                return chuselnuk%znamennuk;
            }
        }
        Dilennya dilennya = new Dilennya();
        dilennya.setChuselnuk(21);
        dilennya.setZnamennuk(4);
        System.out.println("Chastka " + dilennya.getChastku());
        System.out.println("Ostacha " + dilennya.getOstacha());
    }
}
