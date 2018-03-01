package extremity.extremesoft.com.ktapplication.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName




/**
 * Created by ravdesai on 01-03-2018.
 */
class GetUserModel {

    @SerializedName("page")
    @Expose
    private var page: Int? = null
    @SerializedName("per_page")
    @Expose
    private var perPage: Int? = null
    @SerializedName("total")
    @Expose
    private var total: Int? = null
    @SerializedName("total_pages")
    @Expose
    private var totalPages: Int? = null
    @SerializedName("data")
    @Expose
    private var data: List<Datum>? = null

    fun getPage(): Int? {
        return page
    }

    fun setPage(page: Int?) {
        this.page = page
    }

    fun getPerPage(): Int? {
        return perPage
    }

    fun setPerPage(perPage: Int?) {
        this.perPage = perPage
    }

    fun getTotal(): Int? {
        return total
    }

    fun setTotal(total: Int?) {
        this.total = total
    }

    fun getTotalPages(): Int? {
        return totalPages
    }

    fun setTotalPages(totalPages: Int?) {
        this.totalPages = totalPages
    }

    fun getData(): List<Datum>? {
        return data
    }

    fun setData(data: List<Datum>) {
        this.data = data
    }


    class Datum{

        @SerializedName("id")
        @Expose
        private var id: Int? = null
        @SerializedName("first_name")
        @Expose
        private var firstName: String? = null
        @SerializedName("last_name")
        @Expose
        private var lastName: String? = null
        @SerializedName("avatar")
        @Expose
        private var avatar: String? = null

        fun getId(): Int? {
            return id
        }

        fun setId(id: Int?) {
            this.id = id
        }

        fun getFirstName(): String? {
            return firstName
        }

        fun setFirstName(firstName: String) {
            this.firstName = firstName
        }

        fun getLastName(): String? {
            return lastName
        }

        fun setLastName(lastName: String) {
            this.lastName = lastName
        }

        fun getAvatar(): String? {
            return avatar
        }

        fun setAvatar(avatar: String) {
            this.avatar = avatar
        }


    }
}