package com.training.oop.calling;

// Primitive types are passed by value.
class Called {

    int a, b;

    public Called() {

    }

    public Called(int i, int j) {
        a = i;
        b = j;
    }


    /* This method causes no change to the arguments used in the call. */
    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }

    /* Pass an object. Now, ob.a and ob.b in object used in the call will be changed. */
    void change(Called ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
