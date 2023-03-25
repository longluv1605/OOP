import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Layer {
    private List<Shape> shapes = new ArrayList<Shape>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Get in4.
     * 
     * @return - in4
     */
    public String getInfo() {
        String info = "Layer of crazy shapes:\n";

        for (Shape shape : shapes) {
            info += shape.toString() + "\n";
        }

        return info;
    }

    /**
     * Remove circles.
     */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
                i--;
            }
        }
    }

    /**
     * Remove duplicates.
     */
    public void removeDuplicates() {
        Set<String> res = new HashSet<>();
        for (int i = 0; i < shapes.size(); i++) {
            if (res.contains(shapes.get(i).info())) {
                shapes.remove(i);
                i--;
            } else {
                res.add(shapes.get(i).info());
            }
        }
    }
}
