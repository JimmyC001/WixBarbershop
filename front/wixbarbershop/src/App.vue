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
      <button @click="Crear()">registrarse</button>
    </div>
  </div>
</template>

<script>
import { ref } from "vue";
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

    async function Crear() {
      const url = "http://localhost:8080/Users/Customer/Create/";
      const config = {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({
          userId: "1ffe06f3-399e-4d5e-ae18-40c58a0dc0c1",
          phone: "3133134596",
          username: "Germacho",
          password: "123454567",
        }),
      };

      const response = await fetch(url, config);

      if (!response.ok) {
        throw new Error(response.statusText);
      }
      console.log(response.json().Error);
    }
    function show() {
      console.log(customer.value.name);
      console.log(customer.value.cellphone);
      console.log(customer.value.password);
    }
    return {
      counter,
      addCounter,
      customer,
      show,
      Crear,
    };
  },
};
</script>

<style>
.form {
  margin-top: 2rem;
}
</style>
