public  class ConcreteCardNumDecorator  extends IDecorator {
    StringBuilder number = new StringBuilder();
    private String decorate;

    public ConcreteCardNumDecorator(IDisplayComponent c) {
        super(c);
    }

    public String decorate(String s) {
        number.setLength(0);
        if (!s.equals("[4444 4444 4444 4444]" + "  ")) {
            for (int i = 0; i < s.length(); i++) {
                if (i == 5 || i == 9 || i == 13)
                    number.append(" " + s.charAt(i));
                else
                    number.append(s.charAt(i));
            }
            return number.toString();
        } else
            return s;
    }

    public String display() {
        decorate=super.display();
        return decorate(decorate);
    }

    public void addSubComponent(IDisplayComponent c) {
        super.addSubComponent(c);
    }

    public void key(String ch, int cnt) {
        super.key(ch,cnt);

    }

    public void setNext(IKeyEventHandler next) {
       super.setNext(next);
    }
}
