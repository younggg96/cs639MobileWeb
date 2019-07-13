package com.example.materialdesigntest;

import androidx.fragment.app.Fragment;

interface NavigationHost {

    void navigateTo(Fragment fragment, boolean addToBackstack);

}
