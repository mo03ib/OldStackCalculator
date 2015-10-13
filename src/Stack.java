/**
 * Stack Version 1 from Lecture 7
 *   
 * @author Ian Barnes and Richard Walker
 * @version $Revision: 2005.3 $, $Date: 2005/03/13 23:34:09 $
 */
public class Stack {

    /* Fields */
    
    /** The item on top of the stack */
    private Object value;

    /** The rest of the stack, another stack */
    private Stack rest;
    
    /** Is this an empty stack? */
    private boolean empty;

    /* Constructors */
    
    /** Initialise to a new empty stack */
    public Stack() {
        value = null;
        rest = null;
        empty = true;
    }
    
    /** Initialise to an identical copy of another stack */
    private Stack(Stack other) {
        this.value = other.value;
        this.rest = other.rest;
        this.empty = other.empty;
    }

    /* Methods */

    /** Is this an empty stack? */
    public boolean isEmpty() {
	return empty;
    }
    
    /** Add x at the top */
    public void push(Object x) {
        this.rest = new Stack(this);
        this.value = x;
        this.empty = false;
    }
    
    /** Pop off the top value */
    public void pop() {
        // require !isEmpty()
        this.value = rest.value;
        this.empty = rest.empty;
        this.rest = rest.rest;
    }
    
    /** The top element */
    public Object top() {
        // require !isEmpty()
        return value;
    }
    
    /** The number of elements */
    public int depth() {
        if (isEmpty()) {
            return 0;
        } else {
            return 1 + rest.depth();
        }
    }
}
