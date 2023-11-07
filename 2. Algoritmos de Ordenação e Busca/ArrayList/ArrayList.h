template <typename T>
class ArrayList {
private:
    int capacity;
    int size;
    T* data;

public:
    ArrayList();
    ~ArrayList();
    bool validPosition(int index);
    void secureSpace();
    void add(T value);
    void add(T value, int index);
    bool isEmpty();
    int length();
    void print();
    void remove(int index);
    T get(int index); 
};
