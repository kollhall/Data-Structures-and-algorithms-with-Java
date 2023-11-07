public class ArrayList<Type> {
    private Type[] objects ;
    private int totalObjects = 0;
    //Constructor
    public ArrayList(int amount) {
        objects = (Type[]) new Object[amount];
    }
    public void ensureSpace() {
        if (this.objects.length == totalObjects) {
            Type[] newArray = (Type[]) new Object[2 * this.totalObjects];
            for (int i = 0; i < this.objects.length; i++) {
                newArray[i] = this.objects[i];
            }
            objects = newArray;
        }
    }

    public int size() {
        return this.totalObjects;
    }
    public boolean validPosition(int position) {
        return position >= 0 && position < this.totalObjects;
    }

    //Add object at the end
    public void add(Type object) {
        this.ensureSpace();
        objects[this.totalObjects] = object;
        this.totalObjects++;
    }
    //Add object in any position
    public void add(Type object, int position) {
        if (!this.validPosition(position)) {
            throw new IllegalArgumentException("Invalid position");
        }
        this.ensureSpace();
        for (int i = this.totalObjects; i >= position; i--){
            this.objects[i + 1] = this.objects[i];
        }
        this.objects[position] = object;
        this.totalObjects++;
    }
    public boolean contens(Type object) {
        for (int i = 0; i < this.totalObjects; i++) {
            if (this.objects[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    public Type get(int position) {
        if (!validPosition(position)) {
            throw new IllegalArgumentException("Invalid position");
        }
        return this.objects[position];
    }
    public void remove(int position) {
        if (!this.validPosition(position)) {
            throw new IllegalArgumentException("Invalid position");
        }
        for (int i = position; i < this.totalObjects - 1; i++) {
            this.objects[i] = this.objects[i + 1];
        }
        this.totalObjects--;
    }

    public int indexOf(Type object) {
        if (!contens(object)) {
            throw new IllegalArgumentException("Invalid object");
        }
        int pos = -1;
        for (int i = 0; i < this.totalObjects; i++) {
            if (object.equals(this.get(i))) {
                pos = i;
                return pos;
            }
        }
        return pos;
    }
    public void remove(Type object) {
        int pos = this.indexOf(object);
        for (int i = pos; i < this.totalObjects-1; i++) {
            this.objects[i] = this.objects[i+1];
        }
        this.totalObjects--;
    }

    public String toString() {

        if (totalObjects == 0) {
            return "[]";
        }
        String string = "[";
        for(int i = 0; i < this.totalObjects - 1; i++) {
            string += this.objects[i] + " , ";
        }
        string += objects[totalObjects - 1] + "]";
        return string;
    }
}
