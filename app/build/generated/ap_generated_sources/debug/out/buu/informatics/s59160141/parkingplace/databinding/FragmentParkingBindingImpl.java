package buu.informatics.s59160141.parkingplace.databinding;
import buu.informatics.s59160141.parkingplace.R;
import buu.informatics.s59160141.parkingplace.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentParkingBindingImpl extends FragmentParkingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.slot_1, 4);
        sViewsWithIds.put(R.id.slot_2, 5);
        sViewsWithIds.put(R.id.slot_3, 6);
        sViewsWithIds.put(R.id.update_button, 7);
        sViewsWithIds.put(R.id.delete_button, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener carBrandandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of carData.carBrand
            //         is carData.setCarBrand((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(carBrand);
            // localize variables for thread safety
            // carData
            buu.informatics.s59160141.parkingplace.CarData carData = mCarData;
            // carData.carBrand
            java.lang.String carDataCarBrand = null;
            // carData != null
            boolean carDataJavaLangObjectNull = false;



            carDataJavaLangObjectNull = (carData) != (null);
            if (carDataJavaLangObjectNull) {




                carData.setCarBrand(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener licensePlateandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of carData.licensePlate
            //         is carData.setLicensePlate((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(licensePlate);
            // localize variables for thread safety
            // carData
            buu.informatics.s59160141.parkingplace.CarData carData = mCarData;
            // carData.licensePlate
            java.lang.String carDataLicensePlate = null;
            // carData != null
            boolean carDataJavaLangObjectNull = false;



            carDataJavaLangObjectNull = (carData) != (null);
            if (carDataJavaLangObjectNull) {




                carData.setLicensePlate(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener nameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of carData.name
            //         is carData.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(name);
            // localize variables for thread safety
            // carData
            buu.informatics.s59160141.parkingplace.CarData carData = mCarData;
            // carData != null
            boolean carDataJavaLangObjectNull = false;
            // carData.name
            java.lang.String carDataName = null;



            carDataJavaLangObjectNull = (carData) != (null);
            if (carDataJavaLangObjectNull) {




                carData.setName(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentParkingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentParkingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[2]
            , (android.widget.Button) bindings[8]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[3]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[7]
            );
        this.carBrand.setTag(null);
        this.licensePlate.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.carData == variableId) {
            setCarData((buu.informatics.s59160141.parkingplace.CarData) variable);
        }
        else if (BR.slots == variableId) {
            setSlots((buu.informatics.s59160141.parkingplace.CarData[]) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCarData(@Nullable buu.informatics.s59160141.parkingplace.CarData CarData) {
        this.mCarData = CarData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.carData);
        super.requestRebind();
    }
    public void setSlots(@Nullable buu.informatics.s59160141.parkingplace.CarData[] Slots) {
        this.mSlots = Slots;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        buu.informatics.s59160141.parkingplace.CarData carData = mCarData;
        java.lang.String carDataLicensePlate = null;
        java.lang.String carDataCarBrand = null;
        java.lang.String carDataName = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (carData != null) {
                    // read carData.licensePlate
                    carDataLicensePlate = carData.getLicensePlate();
                    // read carData.carBrand
                    carDataCarBrand = carData.getCarBrand();
                    // read carData.name
                    carDataName = carData.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.carBrand, carDataCarBrand);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.licensePlate, carDataLicensePlate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, carDataName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.carBrand, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, carBrandandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.licensePlate, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, licensePlateandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.name, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nameandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): carData
        flag 1 (0x2L): slots
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}