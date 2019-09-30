package com.company;

public class Button {
    // 3- Local class - Inner class defined inside a scope block usually a method or an if-statement
    //                - The scope of the class is limited to that block.
    //                - Used less often - May be used as comparators when sorting objects.
    // 4- Anonymous class - A nested class without a class name
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
