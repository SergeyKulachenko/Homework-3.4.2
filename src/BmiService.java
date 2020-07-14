public class BmiService {
    public float calculate(float height, float mass) {
        float index =  mass / (height * height);
        return  index;
    }

}
