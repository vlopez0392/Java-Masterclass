package com.company;

public class Button {
    // 3- Local class - Inner class defined inside a scope block usually a method or an if-statement
    //                - The scope of the class is limited to that block.
    //                - Used less often - May be used as comparators when sorting objects.
    //                - Example - Assigning the same object to the same buttons in the screen at the same time.
    //                          - It makes sense to use a local class because we are not using it in a shared environment.

    // 4- Anonymous class - A nested local class without a class name
    //                    - Must be declared and instantiated at the same time because they haven't got a name.
    //                    - Used when a local class is required only once.
    //                    - They are very common in attaching event handlers to buttons in a UI (e.g. Android)
    //                    - Useful to have because we can declare an object and assign it to a button in one expression.

    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(this.title);
   }

   public interface OnClickListener{
        void onClick(String title);
    }
}
