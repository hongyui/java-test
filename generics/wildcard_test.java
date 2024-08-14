class WildCard<T>{
    private T content;
    public void setContent(T content) {
        this.content = content;
    }
    
    public T getContent() {
        return content;
    }
    
    public void printBox(Box<?> box) {
        System.out.println(box.getContent());
    }
    
}

public class wildcard_test {
    public static void main(String[] args) {
        WildCard<Integer> wildCard = new WildCard<>();
        Box<Integer> box1 = new Box<>();
        Box<String> box2 = new Box<>();
        box1.setContent(10);
        box2.setContent("Hello");
        wildCard.printBox(box1);
        wildCard.printBox(box2);
    }
}