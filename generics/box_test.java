class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
public class box_test {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        Box<String> box2 = new Box<>();
        box1.setContent(10);
        System.out.println(box1.getContent());
        box2.setContent("Hello");
        System.out.println(box2.getContent());
    }
}