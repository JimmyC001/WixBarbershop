package com.wixteam.barbershop.Users.Address.Infraestructure.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wixteam.barbershop.Users.Address.Application.Create.AddressCreator;
import com.wixteam.barbershop.Users.User.Infraestructure.Controllers.PostCustomerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Address")
public class PostAddressController {
    @Autowired
    private AddressCreator creator;
    @PostMapping(value = "/Create/")
    public ResponseEntity<String> execute (@RequestBody AddressRequest request ){
        creator.execute(request.getAddressId(),request.getAddressDetail(),request.getAddressCity(),request.getAddressAdditionalInfo(),request.getAddressNeighborhodd(),request.getUserId());
        return ResponseEntity.status(HttpStatus.CREATED).body(" Address " + request.toString() );
    }

    static class AddressRequest{
        @JsonProperty("addressId")
        private String addressId ;
        @JsonProperty("addressCity")
        private String addressCity ;
        @JsonProperty("addressDetail")
        private String addressDetail ;
        @JsonProperty("addressAdditionalInfo")
        private String addressAdditionalInfo ;
        @JsonProperty("addressNeighborhodd")
        private String addressNeighborhodd ;
        @JsonProperty("userId")
        private String userId ;


        @Override
        public String toString() {
            return "AddressRequest{" +
                    "addressId='" + addressId + '\'' +
                    ", addressCity='" + addressCity + '\'' +
                    ", addressDetail='" + addressDetail + '\'' +
                    ", addressAdditionalInfo='" + addressAdditionalInfo + '\'' +
                    ", addressNeighborhodd='" + addressNeighborhodd + '\'' +
                    ", userId='"+userId+'\''+
                    '}';
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getAddressId() {
            return addressId;
        }

        public void setAddressId(String addressId) {
            this.addressId = addressId;
        }

        public String getAddressCity() {
            return addressCity;
        }

        public void setAddressCity(String addressCity) {
            this.addressCity = addressCity;
        }

        public String getAddressDetail() {
            return addressDetail;
        }

        public void setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
        }

        public String getAddressAdditionalInfo() {
            return addressAdditionalInfo;
        }

        public void setAddressAdditionalInfo(String addressAdditionalInfo) {
            this.addressAdditionalInfo = addressAdditionalInfo;
        }

        public String getAddressNeighborhodd() {
            return addressNeighborhodd;
        }

        public void setAddressNeighborhodd(String addressNeighborhodd) {
            this.addressNeighborhodd = addressNeighborhodd;
        }
    }
}
