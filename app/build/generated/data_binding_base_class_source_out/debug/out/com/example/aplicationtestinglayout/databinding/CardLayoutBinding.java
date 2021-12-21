// Generated by view binder compiler. Do not edit!
package com.example.aplicationtestinglayout.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aplicationtestinglayout.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CardLayoutBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView ColorViewTasks;

  @NonNull
  public final TextView DonoProv;

  @NonNull
  public final TextView HoraTarefa;

  @NonNull
  public final TextView StatusProv;

  @NonNull
  public final ImageView TypeImage;

  @NonNull
  public final Button buttonDeletar;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView data;

  @NonNull
  public final TextView descri;

  @NonNull
  public final ConstraintLayout relativeLayout;

  @NonNull
  public final TextView titulo;

  private CardLayoutBinding(@NonNull CardView rootView, @NonNull ImageView ColorViewTasks,
      @NonNull TextView DonoProv, @NonNull TextView HoraTarefa, @NonNull TextView StatusProv,
      @NonNull ImageView TypeImage, @NonNull Button buttonDeletar, @NonNull CardView cardView,
      @NonNull TextView data, @NonNull TextView descri, @NonNull ConstraintLayout relativeLayout,
      @NonNull TextView titulo) {
    this.rootView = rootView;
    this.ColorViewTasks = ColorViewTasks;
    this.DonoProv = DonoProv;
    this.HoraTarefa = HoraTarefa;
    this.StatusProv = StatusProv;
    this.TypeImage = TypeImage;
    this.buttonDeletar = buttonDeletar;
    this.cardView = cardView;
    this.data = data;
    this.descri = descri;
    this.relativeLayout = relativeLayout;
    this.titulo = titulo;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CardLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CardLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.card_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CardLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ColorViewTasks;
      ImageView ColorViewTasks = ViewBindings.findChildViewById(rootView, id);
      if (ColorViewTasks == null) {
        break missingId;
      }

      id = R.id.DonoProv;
      TextView DonoProv = ViewBindings.findChildViewById(rootView, id);
      if (DonoProv == null) {
        break missingId;
      }

      id = R.id.HoraTarefa;
      TextView HoraTarefa = ViewBindings.findChildViewById(rootView, id);
      if (HoraTarefa == null) {
        break missingId;
      }

      id = R.id.StatusProv;
      TextView StatusProv = ViewBindings.findChildViewById(rootView, id);
      if (StatusProv == null) {
        break missingId;
      }

      id = R.id.TypeImage;
      ImageView TypeImage = ViewBindings.findChildViewById(rootView, id);
      if (TypeImage == null) {
        break missingId;
      }

      id = R.id.buttonDeletar;
      Button buttonDeletar = ViewBindings.findChildViewById(rootView, id);
      if (buttonDeletar == null) {
        break missingId;
      }

      CardView cardView = (CardView) rootView;

      id = R.id.data;
      TextView data = ViewBindings.findChildViewById(rootView, id);
      if (data == null) {
        break missingId;
      }

      id = R.id.descri;
      TextView descri = ViewBindings.findChildViewById(rootView, id);
      if (descri == null) {
        break missingId;
      }

      id = R.id.relativeLayout;
      ConstraintLayout relativeLayout = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout == null) {
        break missingId;
      }

      id = R.id.titulo;
      TextView titulo = ViewBindings.findChildViewById(rootView, id);
      if (titulo == null) {
        break missingId;
      }

      return new CardLayoutBinding((CardView) rootView, ColorViewTasks, DonoProv, HoraTarefa,
          StatusProv, TypeImage, buttonDeletar, cardView, data, descri, relativeLayout, titulo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
