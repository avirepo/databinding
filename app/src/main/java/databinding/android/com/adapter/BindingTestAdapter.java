package databinding.android.com.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import databinding.android.com.R;
import databinding.android.com.databinding.BindingListItemBinding;
import databinding.android.com.model.ListItem;

/**
 * Created by vikas on 12/15/15.
 */
public class BindingTestAdapter extends RecyclerView.Adapter<BindingTestAdapter.BindingTestViewHolder> {
    private final List<ListItem> mData;

    public BindingTestAdapter(List<ListItem> pData) {
        mData = pData;
    }


    @Override
    public BindingTestAdapter.BindingTestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        BindingListItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext())
                , R.layout.binding_list_item, parent, false);
        return new BindingTestViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(BindingTestAdapter.BindingTestViewHolder holder, int position) {
        holder.mBinding.setListItem(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    static class BindingTestViewHolder extends RecyclerView.ViewHolder {
        private final BindingListItemBinding mBinding;

        public BindingTestViewHolder(BindingListItemBinding pBinding) {
            super(pBinding.getRoot());
            mBinding = pBinding;
        }
    }
}
