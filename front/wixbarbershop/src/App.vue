<template>
  <div>
    <div class="wrapper-input">
      <label>Nombre:</label>
      <input type="text" class="form" v-model="customer.name" />
    </div>
    <div class="wrapper-input">
      <label>Celular:</label>
      <input type="text" class="form" v-model="customer.cellphone" />
    </div>
    <div class="wrapper-input">
      <label>Contraseña:</label>
      <input type="text" class="form" v-model="customer.password" />
    </div>
    <button @click="getAll">registrarse</button>
  </div>
</template>

<script>
import { ref } from "vue";
import axios from "axios";
export default {
  name: "App",
  setup() {
    const counter = ref(0);
    const customer = ref({
      name: "",
      cellphone: "",
      password: "",
    });

    function addCounter() {
      counter.value--;
    }
    function show() {
      console.log(customer.value.name);
      console.log(customer.value.cellphone);
      console.log(customer.value.password);
    }
    function getAll() {
      axios
        .get("http://localhost:8080/Users/Customers/All")
        .then((response) => {
          console.log(response);
        })
        .catch((e) => console.log(e));
    }
    return {
      counter,
      addCounter,
      customer,
      show,
      getAll,
    };
  },
};
</script>

<style>
.form {
  margin-top: 2rem;
}
</style>
