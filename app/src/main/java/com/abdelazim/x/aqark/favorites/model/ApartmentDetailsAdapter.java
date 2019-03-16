package com.abdelazim.x.aqark.favorites.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.abdelazim.x.aqark.R;

import java.util.List;

public class ApartmentDetailsAdapter extends RecyclerView.Adapter<ApartmentDetailsAdapter.ViewHolder> {
    private List<ApartmentDetails> apartmentDetailsList;

    public List<ApartmentDetails> getApartmentDetailsList() {
        return apartmentDetailsList;
    }

    public void setApartmentDetailsList(List<ApartmentDetails> apartmentDetailsList) {
        this.apartmentDetailsList = apartmentDetailsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_apartment_details, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ApartmentDetails apartmentDetails = new ApartmentDetails();
        viewHolder.address.setText(apartmentDetails.getAddress());
        viewHolder.area.setText(apartmentDetails.getArea());
        viewHolder.numberOfRooms.setText(apartmentDetails.getNumberOfRooms());
        viewHolder.numberOfBathrooms.setText(apartmentDetails.getNumberOfBathrooms());
        viewHolder.floorType.setText(apartmentDetails.getFloorType());
        viewHolder.finishingType.setText(apartmentDetails.getFinishingType());
        viewHolder.equipments.setText(apartmentDetails.getEquipments());
    }

    @Override
    public int getItemCount() {
        return apartmentDetailsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView address, area, numberOfRooms, numberOfBathrooms, floorType, finishingType, equipments;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            address = itemView.findViewById(R.id.lbl_address);
            area = itemView.findViewById(R.id.lbl_area);
            numberOfRooms = itemView.findViewById(R.id.lbl_numberOfRooms);
            numberOfBathrooms = itemView.findViewById(R.id.lbl_numberOfBathrooms);
            floorType = itemView.findViewById(R.id.lbl_floorType);
            finishingType = itemView.findViewById(R.id.lbl_finishingType);
            equipments = itemView.findViewById(R.id.lbl_equipments);
        }
    }
}
