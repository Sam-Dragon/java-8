package pattern.template.design;

public interface Rotatable {
    void setRotatingAngle(int angleToDegrees);
    int getRotatingAngle();
    
    default void rotateBy(int angleInDegrees) {
        setRotatingAngle(angleInDegrees);
    }
}
