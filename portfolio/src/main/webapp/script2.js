/** Fetches the current header from the server and adds it to the page. */
async function showServerText() {
  const responseFromServer = await fetch('/head');
  const textFromResponse = await responseFromServer.text();

  const headContainer = document.getElementById('header-container');
  headContainer.innerText = textFromResponse;
}
