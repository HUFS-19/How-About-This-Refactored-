import styled from 'styled-components';

export const Logo = () => {
  return (
    <LogoBox>
      <p>
        이거<span>?</span>
      </p>
      <hr />
      <p>
        <span>!</span>추천
      </p>
    </LogoBox>
  );
};

export const LogoBox = styled.div`
  color: black;
  margin: 30px;
  padding: 15px;
  font-family: var(--gowun);
  font-size: 40px;
  font-style: italic;
  cursor: pointer;
  user-select: none;

  p {
    padding: 0px 20px;

    span {
      padding: 0px 25px;
    }
  }

  hr {
    margin: 2px 0px;
    height: 1.6px;
    background-color: black;
    border: none;
  }
`;

export default Logo;
