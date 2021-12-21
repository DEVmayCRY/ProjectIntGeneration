// Generated by view binder compiler. Do not edit!
package com.example.aplicationtestinglayout.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aplicationtestinglayout.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCrationTaskFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button BotaoCancelarTarefa;

  @NonNull
  public final Button BotaoSalvarTarefa;

  @NonNull
  public final RadioButton buttonHabito;

  @NonNull
  public final RadioButton buttonMeta;

  @NonNull
  public final RadioButton buttonTarefa;

  @NonNull
  public final View cont;

  @NonNull
  public final TextInputEditText descricaoTask;

  @NonNull
  public final TextInputLayout descricaoTaskLayout;

  @NonNull
  public final View formBox;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final TextInputEditText imputHora;

  @NonNull
  public final TextInputLayout imputHoraLayout;

  @NonNull
  public final TextInputEditText inputData;

  @NonNull
  public final TextInputLayout inputDataLayout;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final TextInputEditText taskTitleForm;

  @NonNull
  public final TextInputLayout taskTitleFormLayout;

  private FragmentCrationTaskFragmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button BotaoCancelarTarefa, @NonNull Button BotaoSalvarTarefa,
      @NonNull RadioButton buttonHabito, @NonNull RadioButton buttonMeta,
      @NonNull RadioButton buttonTarefa, @NonNull View cont,
      @NonNull TextInputEditText descricaoTask, @NonNull TextInputLayout descricaoTaskLayout,
      @NonNull View formBox, @NonNull ImageView imageView6, @NonNull TextInputEditText imputHora,
      @NonNull TextInputLayout imputHoraLayout, @NonNull TextInputEditText inputData,
      @NonNull TextInputLayout inputDataLayout, @NonNull RadioGroup radioGroup,
      @NonNull TextInputEditText taskTitleForm, @NonNull TextInputLayout taskTitleFormLayout) {
    this.rootView = rootView;
    this.BotaoCancelarTarefa = BotaoCancelarTarefa;
    this.BotaoSalvarTarefa = BotaoSalvarTarefa;
    this.buttonHabito = buttonHabito;
    this.buttonMeta = buttonMeta;
    this.buttonTarefa = buttonTarefa;
    this.cont = cont;
    this.descricaoTask = descricaoTask;
    this.descricaoTaskLayout = descricaoTaskLayout;
    this.formBox = formBox;
    this.imageView6 = imageView6;
    this.imputHora = imputHora;
    this.imputHoraLayout = imputHoraLayout;
    this.inputData = inputData;
    this.inputDataLayout = inputDataLayout;
    this.radioGroup = radioGroup;
    this.taskTitleForm = taskTitleForm;
    this.taskTitleFormLayout = taskTitleFormLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCrationTaskFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCrationTaskFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_cration_task_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCrationTaskFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.BotaoCancelarTarefa;
      Button BotaoCancelarTarefa = ViewBindings.findChildViewById(rootView, id);
      if (BotaoCancelarTarefa == null) {
        break missingId;
      }

      id = R.id.BotaoSalvarTarefa;
      Button BotaoSalvarTarefa = ViewBindings.findChildViewById(rootView, id);
      if (BotaoSalvarTarefa == null) {
        break missingId;
      }

      id = R.id.buttonHabito;
      RadioButton buttonHabito = ViewBindings.findChildViewById(rootView, id);
      if (buttonHabito == null) {
        break missingId;
      }

      id = R.id.buttonMeta;
      RadioButton buttonMeta = ViewBindings.findChildViewById(rootView, id);
      if (buttonMeta == null) {
        break missingId;
      }

      id = R.id.buttonTarefa;
      RadioButton buttonTarefa = ViewBindings.findChildViewById(rootView, id);
      if (buttonTarefa == null) {
        break missingId;
      }

      id = R.id.cont;
      View cont = ViewBindings.findChildViewById(rootView, id);
      if (cont == null) {
        break missingId;
      }

      id = R.id.descricaoTask;
      TextInputEditText descricaoTask = ViewBindings.findChildViewById(rootView, id);
      if (descricaoTask == null) {
        break missingId;
      }

      id = R.id.descricaoTaskLayout;
      TextInputLayout descricaoTaskLayout = ViewBindings.findChildViewById(rootView, id);
      if (descricaoTaskLayout == null) {
        break missingId;
      }

      id = R.id.form_box;
      View formBox = ViewBindings.findChildViewById(rootView, id);
      if (formBox == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.imputHora;
      TextInputEditText imputHora = ViewBindings.findChildViewById(rootView, id);
      if (imputHora == null) {
        break missingId;
      }

      id = R.id.imputHoraLayout;
      TextInputLayout imputHoraLayout = ViewBindings.findChildViewById(rootView, id);
      if (imputHoraLayout == null) {
        break missingId;
      }

      id = R.id.inputData;
      TextInputEditText inputData = ViewBindings.findChildViewById(rootView, id);
      if (inputData == null) {
        break missingId;
      }

      id = R.id.inputDataLayout;
      TextInputLayout inputDataLayout = ViewBindings.findChildViewById(rootView, id);
      if (inputDataLayout == null) {
        break missingId;
      }

      id = R.id.radioGroup;
      RadioGroup radioGroup = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup == null) {
        break missingId;
      }

      id = R.id.taskTitleForm;
      TextInputEditText taskTitleForm = ViewBindings.findChildViewById(rootView, id);
      if (taskTitleForm == null) {
        break missingId;
      }

      id = R.id.taskTitleFormLayout;
      TextInputLayout taskTitleFormLayout = ViewBindings.findChildViewById(rootView, id);
      if (taskTitleFormLayout == null) {
        break missingId;
      }

      return new FragmentCrationTaskFragmentBinding((ConstraintLayout) rootView,
          BotaoCancelarTarefa, BotaoSalvarTarefa, buttonHabito, buttonMeta, buttonTarefa, cont,
          descricaoTask, descricaoTaskLayout, formBox, imageView6, imputHora, imputHoraLayout,
          inputData, inputDataLayout, radioGroup, taskTitleForm, taskTitleFormLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
