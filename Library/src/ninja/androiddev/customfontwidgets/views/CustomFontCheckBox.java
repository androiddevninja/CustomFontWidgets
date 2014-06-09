package ninja.androiddev.customfontwidgets.views;

import ninja.androiddev.customfontwidgets.utils.CustomFontUtils;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class CustomFontCheckBox extends CheckBox {

	public CustomFontCheckBox(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(context, attrs);
	}

	public CustomFontCheckBox(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context, attrs);
	}
	
	public CustomFontCheckBox(Context context) {
		super(context);
		
	}
	
	void init(Context context, AttributeSet attrs)
	{
		if(!isInEditMode())
		{
			CustomFontUtils.setTypeFace(context, attrs, this);
		}
	}
	
}
