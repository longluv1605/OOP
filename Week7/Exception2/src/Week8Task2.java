import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {
    /**
     * throws exception method.
     * 
     * @throws NullPointerException - NPE.
     */
    public void nullPointerEx() throws NullPointerException {
        throw new NullPointerException();
    }

    /**
     * Exception.
     * 
     * @return Exception.
     */
    public String nullPointerExTest() {
        String msg = "";
        try {
            this.nullPointerEx();
        } catch (NullPointerException e) {
            msg = "Lỗi Null Pointer";
        }
        return msg;
    }

    /**
     * throws exception method.
     * 
     * @throws ArrayIndexOutOfBoundsException - AIOOBE.
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Exception.
     * 
     * @return Exception.
     */
    public String arrayIndexOutOfBoundsExTest() {
        String msg = "";
        try {
            this.arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            msg = "Lỗi Array Index Out of Bounds";
        }
        return msg;
    }

    /**
     * throws exception method.
     * 
     * @throws ArithmeticException - AE.
     */
    public void arithmeticEx() throws ArithmeticException {
        throw new ArithmeticException();
    }

    /**
     * Exception.
     * 
     * @return Exception.
     */
    public String arithmeticExTest() {
        String msg = "";
        try {
            this.arithmeticEx();
        } catch (ArithmeticException e) {
            msg = "Lỗi Arithmetic";
        }
        return msg;
    }

    /**
     * throws exception method.
     * 
     * @throws FileNotFoundException - FNFE.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    /**
     * Exception.
     * 
     * @return Exception.
     */
    public String fileNotFoundExTest() {
        String msg = "";
        try {
            this.fileNotFoundEx();
        } catch (FileNotFoundException e) {
            msg = "Lỗi File Not Found";
        }
        return msg;
    }

    /**
     * throws exception method.
     * 
     * @throws IOException - IOE.
     */
    public void ioEx() throws IOException {
        throw new IOException();
    }

    /**
     * Exception.
     * 
     * @return Exception.
     */
    public String ioExTest() {
        String msg = "";
        try {
            this.ioEx();
        } catch (IOException e) {
            msg = "Lỗi IO";
        }
        return msg;
    }
}