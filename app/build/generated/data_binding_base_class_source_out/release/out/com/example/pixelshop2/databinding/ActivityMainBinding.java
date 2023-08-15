// Generated by view binder compiler. Do not edit!
package com.example.pixelshop2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.pixelshop2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView eighthCount;

  @NonNull
  public final Button eighthMinusButton;

  @NonNull
  public final Button eighthPlusButton;

  @NonNull
  public final TextView fifthCount;

  @NonNull
  public final Button fifthMinusButton;

  @NonNull
  public final Button fifthPlusButton;

  @NonNull
  public final TextView forthCount;

  @NonNull
  public final Button forthMinusButton;

  @NonNull
  public final Button forthPlusButton;

  @NonNull
  public final TextView newButton;

  @NonNull
  public final Button newMinusButton;

  @NonNull
  public final Button newPlusButton;

  @NonNull
  public final TextView secondCount;

  @NonNull
  public final Button secondMinusButton;

  @NonNull
  public final Button secondPlusButton;

  @NonNull
  public final TextView seventhCount;

  @NonNull
  public final Button seventhMinusButton;

  @NonNull
  public final Button seventhPlusButton;

  @NonNull
  public final TextView sixthCount;

  @NonNull
  public final Button sixthMinusButton;

  @NonNull
  public final Button sixthPlusButton;

  @NonNull
  public final TextView thirdCount;

  @NonNull
  public final Button thirdMinusButton;

  @NonNull
  public final Button thirdPlusButton;

  private ActivityMainBinding(@NonNull ScrollView rootView, @NonNull TextView eighthCount,
      @NonNull Button eighthMinusButton, @NonNull Button eighthPlusButton,
      @NonNull TextView fifthCount, @NonNull Button fifthMinusButton,
      @NonNull Button fifthPlusButton, @NonNull TextView forthCount,
      @NonNull Button forthMinusButton, @NonNull Button forthPlusButton,
      @NonNull TextView newButton, @NonNull Button newMinusButton, @NonNull Button newPlusButton,
      @NonNull TextView secondCount, @NonNull Button secondMinusButton,
      @NonNull Button secondPlusButton, @NonNull TextView seventhCount,
      @NonNull Button seventhMinusButton, @NonNull Button seventhPlusButton,
      @NonNull TextView sixthCount, @NonNull Button sixthMinusButton,
      @NonNull Button sixthPlusButton, @NonNull TextView thirdCount,
      @NonNull Button thirdMinusButton, @NonNull Button thirdPlusButton) {
    this.rootView = rootView;
    this.eighthCount = eighthCount;
    this.eighthMinusButton = eighthMinusButton;
    this.eighthPlusButton = eighthPlusButton;
    this.fifthCount = fifthCount;
    this.fifthMinusButton = fifthMinusButton;
    this.fifthPlusButton = fifthPlusButton;
    this.forthCount = forthCount;
    this.forthMinusButton = forthMinusButton;
    this.forthPlusButton = forthPlusButton;
    this.newButton = newButton;
    this.newMinusButton = newMinusButton;
    this.newPlusButton = newPlusButton;
    this.secondCount = secondCount;
    this.secondMinusButton = secondMinusButton;
    this.secondPlusButton = secondPlusButton;
    this.seventhCount = seventhCount;
    this.seventhMinusButton = seventhMinusButton;
    this.seventhPlusButton = seventhPlusButton;
    this.sixthCount = sixthCount;
    this.sixthMinusButton = sixthMinusButton;
    this.sixthPlusButton = sixthPlusButton;
    this.thirdCount = thirdCount;
    this.thirdMinusButton = thirdMinusButton;
    this.thirdPlusButton = thirdPlusButton;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.eighthCount;
      TextView eighthCount = ViewBindings.findChildViewById(rootView, id);
      if (eighthCount == null) {
        break missingId;
      }

      id = R.id.eighthMinusButton;
      Button eighthMinusButton = ViewBindings.findChildViewById(rootView, id);
      if (eighthMinusButton == null) {
        break missingId;
      }

      id = R.id.eighthPlusButton;
      Button eighthPlusButton = ViewBindings.findChildViewById(rootView, id);
      if (eighthPlusButton == null) {
        break missingId;
      }

      id = R.id.fifthCount;
      TextView fifthCount = ViewBindings.findChildViewById(rootView, id);
      if (fifthCount == null) {
        break missingId;
      }

      id = R.id.fifthMinusButton;
      Button fifthMinusButton = ViewBindings.findChildViewById(rootView, id);
      if (fifthMinusButton == null) {
        break missingId;
      }

      id = R.id.fifthPlusButton;
      Button fifthPlusButton = ViewBindings.findChildViewById(rootView, id);
      if (fifthPlusButton == null) {
        break missingId;
      }

      id = R.id.forthCount;
      TextView forthCount = ViewBindings.findChildViewById(rootView, id);
      if (forthCount == null) {
        break missingId;
      }

      id = R.id.forthMinusButton;
      Button forthMinusButton = ViewBindings.findChildViewById(rootView, id);
      if (forthMinusButton == null) {
        break missingId;
      }

      id = R.id.forthPlusButton;
      Button forthPlusButton = ViewBindings.findChildViewById(rootView, id);
      if (forthPlusButton == null) {
        break missingId;
      }

      id = R.id.newButton;
      TextView newButton = ViewBindings.findChildViewById(rootView, id);
      if (newButton == null) {
        break missingId;
      }

      id = R.id.newMinusButton;
      Button newMinusButton = ViewBindings.findChildViewById(rootView, id);
      if (newMinusButton == null) {
        break missingId;
      }

      id = R.id.newPlusButton;
      Button newPlusButton = ViewBindings.findChildViewById(rootView, id);
      if (newPlusButton == null) {
        break missingId;
      }

      id = R.id.secondCount;
      TextView secondCount = ViewBindings.findChildViewById(rootView, id);
      if (secondCount == null) {
        break missingId;
      }

      id = R.id.secondMinusButton;
      Button secondMinusButton = ViewBindings.findChildViewById(rootView, id);
      if (secondMinusButton == null) {
        break missingId;
      }

      id = R.id.secondPlusButton;
      Button secondPlusButton = ViewBindings.findChildViewById(rootView, id);
      if (secondPlusButton == null) {
        break missingId;
      }

      id = R.id.seventhCount;
      TextView seventhCount = ViewBindings.findChildViewById(rootView, id);
      if (seventhCount == null) {
        break missingId;
      }

      id = R.id.seventhMinusButton;
      Button seventhMinusButton = ViewBindings.findChildViewById(rootView, id);
      if (seventhMinusButton == null) {
        break missingId;
      }

      id = R.id.seventhPlusButton;
      Button seventhPlusButton = ViewBindings.findChildViewById(rootView, id);
      if (seventhPlusButton == null) {
        break missingId;
      }

      id = R.id.sixthCount;
      TextView sixthCount = ViewBindings.findChildViewById(rootView, id);
      if (sixthCount == null) {
        break missingId;
      }

      id = R.id.sixthMinusButton;
      Button sixthMinusButton = ViewBindings.findChildViewById(rootView, id);
      if (sixthMinusButton == null) {
        break missingId;
      }

      id = R.id.sixthPlusButton;
      Button sixthPlusButton = ViewBindings.findChildViewById(rootView, id);
      if (sixthPlusButton == null) {
        break missingId;
      }

      id = R.id.thirdCount;
      TextView thirdCount = ViewBindings.findChildViewById(rootView, id);
      if (thirdCount == null) {
        break missingId;
      }

      id = R.id.thirdMinusButton;
      Button thirdMinusButton = ViewBindings.findChildViewById(rootView, id);
      if (thirdMinusButton == null) {
        break missingId;
      }

      id = R.id.thirdPlusButton;
      Button thirdPlusButton = ViewBindings.findChildViewById(rootView, id);
      if (thirdPlusButton == null) {
        break missingId;
      }

      return new ActivityMainBinding((ScrollView) rootView, eighthCount, eighthMinusButton,
          eighthPlusButton, fifthCount, fifthMinusButton, fifthPlusButton, forthCount,
          forthMinusButton, forthPlusButton, newButton, newMinusButton, newPlusButton, secondCount,
          secondMinusButton, secondPlusButton, seventhCount, seventhMinusButton, seventhPlusButton,
          sixthCount, sixthMinusButton, sixthPlusButton, thirdCount, thirdMinusButton,
          thirdPlusButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
