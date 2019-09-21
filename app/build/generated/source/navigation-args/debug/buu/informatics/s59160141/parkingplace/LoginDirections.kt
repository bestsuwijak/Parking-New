package buu.informatics.s59160141.parkingplace

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

class LoginDirections private constructor() {
    companion object {
        fun actionLoginToParking(): NavDirections =
                ActionOnlyNavDirections(R.id.action_login_to_parking)
    }
}
