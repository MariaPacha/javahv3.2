public class BmiService {
    public int calculate (int massa, double height) {
        int result = (int) (massa / (height * height));
        return result;
    }
}

