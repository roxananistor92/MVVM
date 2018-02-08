
package android.databinding;
import com.acme.tictactoe.BR;
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 23;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.acme.tictactoe.R.layout.tictactoe:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/tictactoe_0".equals(tag)) {
                            return new com.acme.tictactoe.databinding.TictactoeBindingImpl(bindingComponent, view);
                    }
                    if ("layout-land/tictactoe_0".equals(tag)) {
                            return new com.acme.tictactoe.databinding.TictactoeBindingLandImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for tictactoe is invalid. Received: " + tag);
                }
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -1772524594: {
                if(tag.equals("layout/tictactoe_0")) {
                    return com.acme.tictactoe.R.layout.tictactoe;
                }
                break;
            }
            case -1934791342: {
                if(tag.equals("layout-land/tictactoe_0")) {
                    return com.acme.tictactoe.R.layout.tictactoe;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"viewModel"};
    }
}