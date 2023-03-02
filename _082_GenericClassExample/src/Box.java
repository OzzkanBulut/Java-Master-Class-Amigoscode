import java.util.List;
import java.util.Objects;

public class Box <T extends TechStuff>{
    private List<T> ts;

    public Box(List<T> ts) {
        this.ts = ts;
    }

    public List<T> getTs() {
        return ts;
    }

    public void setTs(List<T> ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        return "Box{" +
                "ts=" + ts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(ts, box.ts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ts);
    }
}
