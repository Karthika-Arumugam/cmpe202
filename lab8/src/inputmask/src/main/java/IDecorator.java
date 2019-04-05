public class IDecorator implements IDisplayComponent,IKeyEventHandler{
private IDisplayComponent c;
private IKeyEventHandler s;
    public IDecorator(IDisplayComponent c)
    {

          this.c=c;
          s=(IKeyEventHandler)c;

    }

    public String display() {
        return c.display();
    }

    public void addSubComponent(IDisplayComponent c) {
        c.addSubComponent(c);

    }

    public void key(String ch, int cnt) {

        s.key(ch,cnt);

    }

    public void setNext(IKeyEventHandler next) {
        s.setNext(next);
    }
}
