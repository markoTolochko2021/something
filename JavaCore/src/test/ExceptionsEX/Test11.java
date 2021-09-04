package test.ExceptionsEX;

public class Test11 {
    void marafon(int temperaturaPovitrya, int tempBigu) throws PodvernutNoguException{
        if (tempBigu > 12){
            throw new PodvernutNoguException("temp to fast" + tempBigu);
        }
        if (temperaturaPovitrya > 32) {
            throw new SveloMishcuException();
        }
    }

    public static void main(String[] args) {
        Test11 test11 = new Test11();
        try {
            test11.marafon(40,10);
        } catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("anyway you will get medal");
        }
    }

}
class PodvernutNoguException extends Exception{
    public PodvernutNoguException(String message) {
        super(message);
    }

    public PodvernutNoguException() {
    }
}
class SveloMishcuException extends RuntimeException{

    public SveloMishcuException(String message) {
        super(message);
    }

    public SveloMishcuException() {
    }
}

