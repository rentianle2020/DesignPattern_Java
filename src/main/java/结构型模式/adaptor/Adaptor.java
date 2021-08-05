package 结构型模式.adaptor;

public class Adaptor implements Target{

    public Adaptee adaptee;
    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String ListenChinese() {
        String sentence = adaptee.speakEnglish();
        return translate(sentence);
    }

    public String translate(String sentence){
        if (sentence.equals("hello")) {
            return "你好";
        }
        return null;
    }
}
